
clear; toilet -t -f smblock --rainbow -F border 'Red Hat Social Innovation Program'
echo ''
echo 'Building open source solutions for the greater good'
echo ''
xdg-open 'https://www.redhat.com/en/about/social-innovation'
read -p "" < /dev/tty

clear; toilet -t -f smblock --rainbow -F border 'Provided digitalization services'
echo ''
echo '- OpenAPIs for smart cities'
xdg-open 'https://smartvillage.computate.org/api'
read -p "" < /dev/tty
echo '- gather data from external services'
xdg-open 'https://smartvillage.computate.org/iot-node?facet.range={!tag=r1}created&stats.field={!tag=r1}created&facet.pivot={!range=r1}classSimpleName'
read -p "" < /dev/tty
echo '- interact with open source projects for simulating traffic'
xdg-open 'https://github.com/computate-org/TLC/blob/7fd9db3f15393c59a9cc47ce8a9023b571b91556/main_pedestrian.py#L1009-L1010'
read -p "" < /dev/tty
echo '- help University students study smart city indicators'
echo ''
xdg-open 'https://smartvillage.computate.org/simulation-report?facet.range={!tag=r1}created&stats.field={!tag=r1}created&facet.pivot={!range=r1}classSimpleName'
read -p "" < /dev/tty

clear; toilet -t -f smblock --rainbow -F border 'Running Research Projects in the Cloud'
echo ''
echo 'Every website deserves:'
echo '  - security'
xdg-open 'https://console.pro-us-east-1.openshift.com/console/project/computateorg/browse/dc/sso?tab=configuration'
read -p "" < /dev/tty
echo '  - high availablity'
xdg-open 'https://console-openshift-console.apps.smaug.na.operate-first.cloud/k8s/ns/smart-village-view/deploymentconfigs/smart-village-view/replicationcontrollers'
read -p "" < /dev/tty
echo '  - scalability'
xdg-open 'https://console-openshift-console.apps.smaug.na.operate-first.cloud/k8s/ns/smart-village-view/deploymentconfigs/smart-village-view'
read -p "" < /dev/tty
echo '  - updates'
xdg-open 'https://console-openshift-console.apps.smaug.na.operate-first.cloud/k8s/ns/smart-village-view/imagestreams/java'
read -p "" < /dev/tty
echo '  - storage'
xdg-open 'https://console-openshift-console.apps.smaug.na.operate-first.cloud/k8s/ns/smart-village-view/persistentvolumeclaims'
read -p "" < /dev/tty
echo ''

clear; toilet -t -f smblock --rainbow -F border 'Red Hat OpenShift Cloud Environment'
echo ''
echo 'take a look into our Operate First cloud environment in production:'
xdg-open 'https://www.operate-first.cloud/'
read -p "" < /dev/tty
xdg-open 'https://console-openshift-console.apps.smaug.na.operate-first.cloud/topology/ns/smart-village-view?view=graph'
read -p "" < /dev/tty
echo '  - PostgreSQL relational database'
echo '  - Apache Zookeeper Cluster Manager'
echo '  - Apache Solr Search Engine'
echo '  - Smarta Byar Smart Village'
echo '  - Smarta Byar Smart Village Worker'
echo '  - Smart Traffic Light Controller SUMO'
echo ''

clear; toilet -t -f smblock --rainbow -F border 'How do our microservices communicate?'
echo ''
echo 'connecting microservices:'
echo '  - PostgreSQL port 5432'
echo '  - Apache Zookeeper Cluster Management'
echo '  - Apache Solr Search REST API'
echo '  - Smarta Byar Smart Village REST API'
echo '  - Red Hat Vert.X Event Bus'
echo '  - Strimzi Kafka Topics'
echo ''
xdg-open 'https://console-openshift-console.apps.smaug.na.operate-first.cloud/topology/ns/smart-village-view?view=graph'
read -p "" < /dev/tty

clear; toilet -t -f smblock --rainbow -F border "Our project's open source communities"
echo ''
echo 'our communities:'
echo '  - GitHub'
xdg-open 'https://github.com/computate-org/smartabyar-smartvillage/'
read -p "" < /dev/tty
echo '  - Quay.io'
xdg-open 'https://quay.io/organization/computateorg'
read -p "" < /dev/tty
echo '  - Maven Central'
xdg-open 'https://mvnrepository.com/artifact/org.computate'
read -p "" < /dev/tty
echo '  - Mailing List'
xdg-open 'https://computate.topicbox.com/groups/smartabyar-smartvillage'
read -p "" < /dev/tty
echo '  - Youtube'
xdg-open 'https://www.youtube.com/@computateorg/playlists'
read -p "" < /dev/tty
echo ''

clear; toilet -t -f smblock --rainbow -F border "Demo of a traffic simulation"
echo ''
echo 'Steps to run a simulation:'
echo '  - Visit the map results dashboard at smartvillage.computate.org'
echo '  - Log in to Red Hat Single Sign On'
echo '  - Pivot deselect object type'
echo '  - Pivot on location'
echo '  - Search rows: 500'
echo '  - Filter simulation name list: Veberöd intersection'
echo '  - Stats on Time in seconds'
echo '  - Speed in seconds 0.5'
echo '  - Click [ animate ]'
xdg-open 'https://smartvillage.computate.org/map-result?facet.range={!tag=r1}created&stats.field={!tag=r1}created&facet.pivot={!range=r1}classSimpleName'
read -p "" < /dev/tty

#set -f
#systemctl --user stop watch-smartabyar-smartvillage
#
#toilet -t -f smblock Run Base Automation
#echo Install all of the base application code that is generic to most projects
#echo ansible-playbook ~/.local/src/computate-org/vertx_project.yml -e @~/.local/src/smartabyar-smartvillage/local/ansible_install_vars.yml
#read -p "" < /dev/tty
#ansible-playbook ~/.local/src/computate-org/vertx_project.yml -e @~/.local/src/smartabyar-smartvillage/local/ansible_install_vars.yml
#
#curl -s 'http://localhost:8983/solr/computate/select?fq=classSort_indexed_int%3A%5B*%20TO%20*%5D&fq=siteNom_indexed_string%3Asmartabyar-smartvillage&fq=partEstClasse_indexed_boolean%3Atrue&q=*%3A*&sort=classSort_indexed_int%20asc&rows=100' \
#| jq -c '.response.docs[]' \
#| while IFS1=$'\n' read -r c; do 
#	toilet -t -f smblock $(echo "$c" | jq -r '.classeNomSimple_enUS_stored_string')
#	DESCRIPTION=$(echo "$c" | jq -r '.contexteDescription_enUS_stored_string')
#	if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
#	classeNomSimple_enUS_stored_string=$(echo "$c" | jq -r '.classeNomSimple_enUS_stored_string')
#	PART_URL='http://localhost:8983/solr/computate/select?fq=siteNom_indexed_string%3Asmartabyar-smartvillage&fq=-partEstClasse_indexed_boolean%3A%5B*%20TO%20*%5D&fq=classeNomSimple_enUS_indexed_string%3A'"$classeNomSimple_enUS_stored_string"'&q=*%3A*&sort=partNumero_indexed_int%20asc&rows=1000'
#	FILE_PATH=$(echo $c | jq -r '.classeCheminAbsolu_stored_string')
#	mkdir -p "$(dirname $FILE_PATH)"
#	echo $c | jq -r '.classeNomEnsemble_enUS_stored_string' | echo "package $(cat -);" | tee $FILE_PATH >/dev/null
#	echo "" | tee -a $FILE_PATH >/dev/null
#	echo $c | jq -r '.classeImportations_enUS_stored_strings[]' | while IFS2=$'\n' read -r p; do 
#		echo $p | echo "import $(cat -);" | tee -a $FILE_PATH >/dev/null
#	done
#	echo "" | tee -a $FILE_PATH >/dev/null
#	echo $c | jq -r '.classeCodeSourceDebut_enUS_stored_string' | tee -a $FILE_PATH >/dev/null
#	read -p "" < /dev/tty
#
#	curl -s "$PART_URL" \
#	| jq -c '.response.docs[]' \
#	| while IFS2=$'\n' read -r p; do 
#		if [[ $(echo "$p" | jq -r '.partEstEntite_stored_boolean') == 'true' ]]
#		then
#			toilet -t -f wideterm  _$(echo "$p" | jq -r '.entiteVar_enUS_stored_string') method
#			DESCRIPTION=$(echo "$p" | jq -r '.entiteDescription_enUS_stored_string')
#			if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
#			PART1=$(echo $p | jq -r '.entiteCodeSourceDebut_enUS_stored_string')
#			PART2=$(echo $p | jq -r '.entiteCodeSource_enUS_stored_string')
#			if [[ $PART2 = 'null' ]]; then PART2=""; fi
#			PART3=$(echo $p | jq -r '.entiteCodeSourceFin_enUS_stored_string')
#			echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
#		else
#			if [[ $(echo "$p" | jq -r '.partEstMethode_stored_boolean') == 'true' ]]
#			then
#				toilet -t -f wideterm  $(echo "$p" | jq -r '.methodeVar_enUS_stored_string') method
#				DESCRIPTION=$(echo "$p" | jq -r '.methodeDescription_enUS_stored_string')
#				if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
#				PART1=$(echo $p | jq -r '.methodeCodeSourceDebut_enUS_stored_string')
#				PART2=$(echo $p | jq -r '.methodeCodeSource_enUS_stored_string')
#				if [[ $PART2 = 'null' ]]; then PART2=""; fi
#				PART3=$(echo $p | jq -r '.methodeCodeSourceFin_enUS_stored_string')
#				echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
#			else
#				if [[ $(echo "$p" | jq -r '.partEstChamp_stored_boolean') == 'true' ]]
#				then
#					toilet -t -f wideterm  $(echo "$p" | jq -r '.champVar_enUS_stored_string') field
#					DESCRIPTION=$(echo "$p" | jq -r '.champDescription_enUS_stored_string')
#					if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
#					PART1=$(echo $p | jq -r '.champCodeSourceDebut_enUS_stored_string')
#					PART2=$(echo $p | jq -r '.champCodeSource_enUS_stored_string')
#					if [[ $PART2 = 'null' ]]; then PART2=""; fi
#					PART3=$(echo $p | jq -r '.champCodeSourceFin_enUS_stored_string')
#					echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
#				else
#					if [[ $(echo "$p" | jq -r '.partEstConstructeur_stored_boolean') == 'true' ]]
#					then
#						toilet -t -f wideterm  $(echo "$p" | jq -r '.classeNomSimple_enUS_stored_string') constructor
#						DESCRIPTION=$(echo "$p" | jq -r '.constructeurDescription_enUS_stored_string')
#						if [[ $DESCRIPTION = 'null' ]]; then DESCRIPTION=""; else echo $DESCRIPTION; fi
#						PART1=$(echo $p | jq -r '.constructeurCodeSourceDebut_enUS_stored_string')
#						PART2=$(echo $p | jq -r '.constructeurCodeSource_enUS_stored_string')
#						if [[ $PART2 = 'null' ]]; then PART2=""; fi
#						PART3=$(echo $p | jq -r '.constructeurCodeSourceFin_enUS_stored_string')
#						echo "${PART1}${PART2}${PART3}" | tee -a $FILE_PATH >/dev/null
#					fi
#				fi
#			fi
#		fi
#		read -p "" < /dev/tty
#	
#	done
#	echo "}" | tee -a $FILE_PATH >/dev/null
#	toilet -t -f wideterm  PAUSE
#	read -p "" < /dev/tty
#done
#
#toilet -t -f smblock Run Install Automation
#echo Install the whole application with one simple ansible script, including database setup, search engine setup and configuration. 
#echo '(cd ~/.local/src/smartabyar-smartvillage && ansible-playbook ~/.ansible/roles/computate.computate_project/install.yml -e @~/.local/src/smartabyar-smartvillage/vault/$USER-vault --vault-password-file ~/.local/src/smartabyar-smartvillage/vault/key -e SITE_NAME=smartabyar-smartvillage -e ENABLE_CODE_GENERATION_SERVICE=true)'
#read -p "" < /dev/tty
#(cd ~/.local/src/smartabyar-smartvillage && ansible-playbook ~/.ansible/roles/computate.computate_project/install.yml -e @~/.local/src/smartabyar-smartvillage/vault/$USER-vault --vault-password-file ~/.local/src/smartabyar-smartvillage/vault/key -e SITE_NAME=smartabyar-smartvillage -e ENABLE_CODE_GENERATION_SERVICE=true)
#
#toilet -t -f smblock Watch Service
#echo Watch the watch-smartabyar-smartvillage service logs as it generates the API and UI code
#echo 'journalctl -f --user-unit watch-smartabyar-smartvillage'
#read -p "" < /dev/tty
#
#toilet -t -f smblock Touch source code
#echo With the watch-smartabyar-smartvillage service running, we can simply touch all of the source code files we just wrote to generate the API and UI code. 
#echo ~/.local/src/smartabyar-smartvillage/bin/touch.sh
#read -p "" < /dev/tty
#~/.local/src/smartabyar-smartvillage/bin/touch.sh
#sleep 120
#~/.local/src/smartabyar-smartvillage/bin/touch.sh
#toilet -t -f smblock Don't forget to generate the OpenAPI Spec
#
#set +f
#
