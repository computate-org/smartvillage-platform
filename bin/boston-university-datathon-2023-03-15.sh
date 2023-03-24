
clear; echo -e 'The Smarta Byar \nSmart Village Partners' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- Smarta Byar'
echo '- Red Hat'
echo '- Boston University'
xdg-open '/home/ctate/.local/src/smartabyar-smartvillage-static/png/smartabyar-redhat-bostonuniversity.png'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Meet the team' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- Yingqing Chen - Boston University'
echo '- Jan Malmgren - Smarta Byar'
echo '- Chris Tate - Red Hat'
xdg-open '/home/ctate/.local/src/smartabyar-smartvillage-static/png/meet-the-team.png'
read -p "" < /dev/tty
echo ''

clear; echo -e 'In the beginning (2022)' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- Jan to Jim: "Just wanted to see what is out there for driving open source for digital twins"'
xdg-open '/home/ctate/.local/src/smartabyar-smartvillage-static/png/smartabyar-smartvillage-in-the-beginning.png'
read -p "" < /dev/tty
echo '- Jim reached out to Hugh Brock at Red Hat Research and the Red Hat Collaboratory with Boston University'
xdg-open 'https://www.bu.edu/rhcollab/about/people/'
read -p "" < /dev/tty
echo '- Jim worked with BU Professor Christos Cassandros to submit an application for funding with the Red Hat Collaboratory with Boston University'
xdg-open 'https://research.redhat.com/blog/research_project/creating-a-global-open-research-platform-to-better-understand-social-sustainability-using-data-from-a-real-life-smart-village/'
read -p "" < /dev/tty
echo ''

clear; echo -e '2023 Collaboratory \nProject Renewal' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- Our project receivied a 2023 Red Hat Collaboratory Research Incubation Award renewal!'
xdg-open 'https://www.bu.edu/rhcollab/2023/01/27/2023-red-hat-collaboratory-research-incubation-awards-recipients/'
read -p "" < /dev/tty
echo ''

clear; echo -e 'The Veberöd \nsmart village' | toilet -t -f smblock --rainbow -F border 
echo ''
toilet -t -f smmono12 'Jan Malmgren'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Our collaborative \ninnovation' | toilet -t -f smblock --rainbow -F border 
echo ''
toilet -t -f smmono12 'Chris Tate'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Red Hat Social \nInnovation Program' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'Building open source solutions for the greater good'
echo ''
xdg-open 'https://www.redhat.com/en/about/social-innovation'
read -p "" < /dev/tty

clear; echo -e 'Provided digitalization \nservices' | toilet -t -f smblock --rainbow -F border 
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

clear; echo -e 'Running Research \nProjects in the Cloud' | toilet -t -f smblock --rainbow -F border 
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

clear; echo -e 'Our Red Hat OpenShift \nCloud Environment' | toilet -t -f smblock --rainbow -F border 
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

clear; echo -e 'How do our microservices \ncommunicate?' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'connecting microservices:'
echo '  - PostgreSQL port 5432'
echo '  - Apache Zookeeper Cluster Management'
echo '  - Apache Solr Search REST API'
echo '  - Smarta Byar Smart Village REST API'
echo '  - Red Hat Vert.X Event Bus'
echo '  - Strimzi Kafka Topics'
echo ''
read -p "" < /dev/tty

clear; echo -e "Our project's \nopen source communities" | toilet -t -f smblock --rainbow -F border 
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

clear; echo -e 'Research at \nBoston University' | toilet -t -f smblock --rainbow -F border 
echo ''
toilet -t -f smmono12 'Yingqing Chen'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Merging real world \nand simulated data' | toilet -t -f smblock --rainbow -F border
echo ''
toilet -t -f smmono12 'Chris Tate'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Real world data' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'IOT Nodes in the village of Veberöd'
echo ''
xdg-open 'https://smartvillage.computate.org/iot-node?facet.range={!tag=r1}created&stats.field={!tag=r1}created&facet.pivot={!range=r1}classSimpleName'
read -p "" < /dev/tty

clear; echo -e "Demo of a \ntraffic simulation" | toilet -t -f smblock --rainbow -F border 
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

clear; echo -e "What's next at \nBoston University" | toilet -t -f smblock --rainbow -F border 
echo ''
toilet -t -f smmono12 'Yingqing Chen'
read -p "" < /dev/tty
echo ''

clear; echo -e "What's next at Red Hat" | toilet -t -f smblock --rainbow -F border 
echo ''
toilet -t -f smmono12 'Chris Tate'
read -p "" < /dev/tty
echo '- More graphs and data in the simulation reports'
xdg-open 'https://smartvillage.computate.org/simulation-report?facet.range={!tag=r1}created&stats.field={!tag=r1}created&facet.pivot={!range=r1}classSimpleName'
read -p "" < /dev/tty
echo '- OpenShift Serverless Operator for on demand application scaling of traffic simulations'
xdg-open 'https://github.com/computate-org/smartabyar-smartvillage/tree/main/openshift/kustomize/bundles/serverless/app'
read -p "" < /dev/tty
echo '- Testing traffic simulations on Red Hat Device Edge and Microshift'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Implementing FIWARE \nstandards for \nsmart devices' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- FIWARE is the open standard for smart device data'
echo '- We met with FIWARE CTO about the Smarta Byar Smart Village project'
echo '- We run social innovation projects in the cloud with FIWARE'
echo '- We use FIWARE smart data models in the project'
echo '- We have integrated with the FIWARE context broker on OpenShift'
xdg-open '/home/ctate/.local/src/smartabyar-smartvillage-static/png/fiware-slides/01-meeting-at-bu-with-fiware.png'
read -p "" < /dev/tty
echo ''

clear; echo -e "What's next for the \nvillage of Veberöd" | toilet -t -f smblock --rainbow -F border 
echo ''
toilet -t -f smmono12 'Jan Malmgren'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Q&A' | toilet -t -f smblock --rainbow -F border 
echo ''
read -p "" < /dev/tty
echo ''
