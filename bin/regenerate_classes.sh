set -f
systemctl --user stop watch-smartvillage-platform

toilet -t -f smblock Run Base Automation
echo Install all of the base application code that is generic to most projects
echo ansible-playbook ~/.local/src/computate-org/vertx_project.yaml -e @~/.local/src/smartvillage-platform/local/ansible_install_vars.yaml
read -p "" < /dev/tty
ansible-playbook ~/.local/src/computate-org/vertx_project.yaml -e @~/.local/src/smartvillage-platform/local/ansible_install_vars.yaml

curl -s 'http://localhost:8983/solr/computate/select?fq=classSort_indexed_int%3A%5B*%20TO%20*%5D&fq=siteNom_indexed_string%3Asmartvillage-platform&fq=partEstClasse_indexed_boolean%3Atrue&q=*%3A*&sort=classSort_indexed_int%20asc&rows=100' \
| jq -c '.response.docs[]' \
| while IFS1=$'\n' read -r c; do 
	toilet -t -f smblock $(echo "$c" | jq -r '.classeNomSimple_enUS_stored_string')
	DESCRIPTION=$(echo "$c" | jq -r '.contexteDescription_enUS_stored_string')
	if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
	classeNomSimple_enUS_stored_string=$(echo "$c" | jq -r '.classeNomSimple_enUS_stored_string')
	PART_URL='http://localhost:8983/solr/computate/select?fq=siteNom_indexed_string%3Asmartvillage-platform&fq=-partEstClasse_indexed_boolean%3A%5B*%20TO%20*%5D&fq=classeNomSimple_enUS_indexed_string%3A'"$classeNomSimple_enUS_stored_string"'&q=*%3A*&sort=partNumero_indexed_int%20asc&rows=1000'
	FILE_PATH=$(echo $c | jq -r '.classeCheminAbsolu_stored_string')
	mkdir -p "$(dirname $FILE_PATH)"
	echo $c | jq -r '.classeNomEnsemble_enUS_stored_string' | echo "package $(cat -);" | tee $FILE_PATH >/dev/null
	echo "" | tee -a $FILE_PATH >/dev/null
	echo $c | jq -r '.classeImportations_enUS_stored_strings[]' | while IFS2=$'\n' read -r p; do 
		echo $p | echo "import $(cat -);" | tee -a $FILE_PATH >/dev/null
	done
	echo "" | tee -a $FILE_PATH >/dev/null
	echo $c | jq -r '.classeCodeSourceDebut_enUS_stored_string' | tee -a $FILE_PATH >/dev/null
	read -p "" < /dev/tty

	curl -s "$PART_URL" \
	| jq -c '.response.docs[]' \
	| while IFS2=$'\n' read -r p; do 
		if [[ $(echo "$p" | jq -r '.partEstEntite_stored_boolean') == 'true' ]]
		then
			toilet -t -f wideterm  _$(echo "$p" | jq -r '.entiteVar_enUS_stored_string') method
			DESCRIPTION=$(echo "$p" | jq -r '.entiteDescription_enUS_stored_string')
			if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
			PART1=$(echo $p | jq -r '.entiteCodeSourceDebut_enUS_stored_string')
			PART2=$(echo $p | jq -r '.entiteCodeSource_enUS_stored_string')
			if [[ $PART2 = 'null' ]]; then PART2=""; fi
			PART3=$(echo $p | jq -r '.entiteCodeSourceFin_enUS_stored_string')
			echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
		else
			if [[ $(echo "$p" | jq -r '.partEstMethode_stored_boolean') == 'true' ]]
			then
				toilet -t -f wideterm  $(echo "$p" | jq -r '.methodeVar_enUS_stored_string') method
				DESCRIPTION=$(echo "$p" | jq -r '.methodeDescription_enUS_stored_string')
				if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
				PART1=$(echo $p | jq -r '.methodeCodeSourceDebut_enUS_stored_string')
				PART2=$(echo $p | jq -r '.methodeCodeSource_enUS_stored_string')
				if [[ $PART2 = 'null' ]]; then PART2=""; fi
				PART3=$(echo $p | jq -r '.methodeCodeSourceFin_enUS_stored_string')
				echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
			else
				if [[ $(echo "$p" | jq -r '.partEstChamp_stored_boolean') == 'true' ]]
				then
					toilet -t -f wideterm  $(echo "$p" | jq -r '.champVar_enUS_stored_string') field
					DESCRIPTION=$(echo "$p" | jq -r '.champDescription_enUS_stored_string')
					if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
					PART1=$(echo $p | jq -r '.champCodeSourceDebut_enUS_stored_string')
					PART2=$(echo $p | jq -r '.champCodeSource_enUS_stored_string')
					if [[ $PART2 = 'null' ]]; then PART2=""; fi
					PART3=$(echo $p | jq -r '.champCodeSourceFin_enUS_stored_string')
					echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
				else
					if [[ $(echo "$p" | jq -r '.partEstConstructeur_stored_boolean') == 'true' ]]
					then
						toilet -t -f wideterm  $(echo "$p" | jq -r '.classeNomSimple_enUS_stored_string') constructor
						DESCRIPTION=$(echo "$p" | jq -r '.constructeurDescription_enUS_stored_string')
						if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
						PART1=$(echo $p | jq -r '.constructeurCodeSourceDebut_enUS_stored_string')
						PART2=$(echo $p | jq -r '.constructeurCodeSource_enUS_stored_string')
						if [[ $PART2 = 'null' ]]; then PART2=""; fi
						PART3=$(echo $p | jq -r '.constructeurCodeSourceFin_enUS_stored_string')
						echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
					fi
				fi
			fi
		fi
		read -p "" < /dev/tty
	
	done
	echo "}" | tee -a $FILE_PATH >/dev/null
	toilet -t -f wideterm  PAUSE
	read -p "" < /dev/tty
done

toilet -t -f smblock Run Install Automation
echo Install the whole application with one simple ansible script, including database setup, search engine setup and configuration. 
echo '(cd ~/.local/src/smartvillage-platform && ansible-playbook ~/.ansible/roles/computate.computate_project/install.yaml -e @~/.local/src/smartvillage-platform/vault/$USER-vault --vault-password-file ~/.local/src/smartvillage-platform/vault/key -e SITE_NAME=smartvillage-platform -e ENABLE_CODE_GENERATION_SERVICE=true)'
read -p "" < /dev/tty
(cd ~/.local/src/smartvillage-platform && ansible-playbook ~/.ansible/roles/computate.computate_project/install.yaml -e @~/.local/src/smartvillage-platform/vault/$USER-vault --vault-password-file ~/.local/src/smartvillage-platform/vault/key -e SITE_NAME=smartvillage-platform -e ENABLE_CODE_GENERATION_SERVICE=true)

toilet -t -f smblock Watch Service
echo Watch the watch-smartvillage-platform service logs as it generates the API and UI code
echo 'journalctl -f --user-unit watch-smartvillage-platform'
read -p "" < /dev/tty

toilet -t -f smblock Touch source code
echo With the watch-smartvillage-platform service running, we can simply touch all of the source code files we just wrote to generate the API and UI code. 
echo ~/.local/src/smartvillage-platform/bin/touch.sh
read -p "" < /dev/tty
~/.local/src/smartvillage-platform/bin/touch.sh
sleep 120
~/.local/src/smartvillage-platform/bin/touch.sh
toilet -t -f smblock Don't forget to generate the OpenAPI Spec

set +f

