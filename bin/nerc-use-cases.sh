
clear; echo -e 'The Smarta Byar \nSmart Village Partners' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- Smarta Byar'
echo '- Red Hat'
echo '- Boston University'
xdg-open '/home/ctate/.local/src/smartvillage-platform-static/png/smartabyar-redhat-bostonuniversity.png'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Meet the Smart \nVillage team' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- Christos Cassandras - Boston University'
echo '- Yingqing Chen - Boston University'
echo '- Jan Malmgren - Smarta Byar'
echo '- Chris Tate - Red Hat'
xdg-open '/home/ctate/.local/src/smartvillage-platform-static/png/meet-the-team.png'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Provided digitalization \nservices' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- OpenAPIs for smart cities'
xdg-open 'https://www.smartabyarsmartvillage.org/api'
read -p "" < /dev/tty
echo '- gather real world data from IOT Nodes in the village of Veberöd'
xdg-open 'https://www.smartabyarsmartvillage.org/iot-node?facet.range={!tag=r1}created&stats.field={!tag=r1}created&facet.pivot={!range=r1}classSimpleName'
read -p "" < /dev/tty
echo '- interact with open source projects for simulating traffic'
xdg-open 'https://github.com/computate-org/TLC/blob/7fd9db3f15393c59a9cc47ce8a9023b571b91556/main_pedestrian.py#L1009-L1010'
read -p "" < /dev/tty
echo '- help University students study smart city indicators'
echo ''
xdg-open 'https://www.smartabyarsmartvillage.org/simulation-report?facet.range={!tag=r1}created&stats.field={!tag=r1}created&facet.pivot={!range=r1}classSimpleName'
read -p "" < /dev/tty

clear; echo -e 'Running Research \nProjects in the Cloud' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'Every website deserves:'
echo '  - security'
xdg-open 'https://console.apps.shift.nerc.mghpcc.org/topology/ns/smart-village-faeeb6c?view=graph'
read -p "" < /dev/tty
echo '  - high availablity'
read -p "" < /dev/tty
echo '  - scalability'
read -p "" < /dev/tty
echo '  - updates'
read -p "" < /dev/tty
echo '  - storage'
xdg-open 'https://console.apps.shift.nerc.mghpcc.org/k8s/ns/smart-village-faeeb6c/core~v1~PersistentVolumeClaim'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Our Red Hat OpenShift \nCloud Environment' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'Watch our event driven traffic simulation report:'
xdg-open 'https://www.smartabyarsmartvillage.org/traffic-simulation/3'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Our Red Hat OpenShift \nCloud Environment' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'take a look at our Open IoT Data Science Architecture:'
xdg-open '/home/ctate/.local/src/smartvillage-platform-static/design/open-iot-data-science-overview.png'
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
xdg-open 'https://github.com/computate-org/smartvillage-platform/'
read -p "" < /dev/tty
echo '  - Quay.io'
xdg-open 'https://quay.io/organization/computateorg'
read -p "" < /dev/tty
echo '  - Maven Central'
xdg-open 'https://mvnrepository.com/artifact/org.computate'
read -p "" < /dev/tty
echo '  - Mailing List'
xdg-open 'https://computate.topicbox.com/groups/smartvillage'
read -p "" < /dev/tty
echo '  - Youtube'
xdg-open 'https://www.youtube.com/@computateorg/playlists'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Implementing FIWARE \nstandards for \nsmart devices' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- FIWARE is the open standard for smart device data'
echo '- We met with FIWARE CTO about the Smarta Byar Smart Village project'
echo '- We run social innovation projects in the cloud with FIWARE'
echo '- We use FIWARE smart data models in the project'
echo '- We have integrated with the FIWARE context broker on OpenShift'
xdg-open '/home/ctate/.local/src/smartvillage-platform-static/png/fiware-slides/01-meeting-at-bu-with-fiware.png'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Meet the Eco \nForecast team' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- Jeff Simeon - BU SAIL'
echo '- Greg Frasco - BU SAIL'
echo '- Shashank Karthikeyan - BU SAIL'
echo '- Dongchen Zhang - BU PHD Student'
echo '- Michael Dietze - BU Professor'
echo '- Chris Tate - Red Hat'
xdg-open '/home/ctate/.local/src/pecan_unconstrained_forecast/image/meet-the-team.png'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Provided ecological \nforecasting services' | toilet -t -f smblock --rainbow -F border 
echo ''
echo '- PEcAn Unconstrained Forecast R-Studio Jupyter Notebook Container Image'
xdg-open 'https://github.com/hicsail/pecan-unconstrained-forecast/blob/main/Containerfile'
read -p "" < /dev/tty
echo '- PEcAn Helm Charts for easy deployment on Red Hat OpenShift'
xdg-open 'https://github.com/PecanProject/pecan-helm'
read -p "" < /dev/tty
echo '- PEcAn Ecological Forecast Model Run Frontend'
xdg-open 'https://pecan-software-application-innovation-lab-sail-projects-fcd6dfa.apps.shift.nerc.mghpcc.org/pecan/02-modelsite.php'
read -p "" < /dev/tty
echo '- Custom Metrics Autoscaler Operator in NERC'
xdg-open 'https://console.apps.shift.nerc.mghpcc.org/k8s/ns/software-application-innovation-lab-sail-projects-fcd6dfa/keda.sh~v1alpha1~ScaledObject/pecan-model-sipnet-136'
read -p "" < /dev/tty

clear; echo -e 'Scaling Research \nProjects in the Cloud' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'Every website deserves:'
echo '  - security'
xdg-open 'https://console.apps.shift.nerc.mghpcc.org/k8s/ns/software-application-innovation-lab-sail-projects-fcd6dfa/deployments/pecan-model-sipnet-136'
echo '  - high availablity'
echo '  - scalability'
echo '  - updates'
echo '  - storage'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Our Red Hat OpenShift \nCloud Environment' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'take a look at our Ecological Forecasting Architecture:'
xdg-open '/home/ctate/.local/src/pecan_unconstrained_forecast/design/pecan-unconstrained-forecast-overview.png'
echo '  - PostgreSQL relational database'
echo '  - BetyDB'
echo '  - PEcAn'
echo '  - Ecological Forecast Models'
echo '  - RabbitMQ'
echo '  - RHODS on OpenShift'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Running jobs in \nNERC OpenShift' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'Types of jobs:'
echo '  - One-time jobs'
xdg-open 'https://console.apps.shift.nerc.mghpcc.org/k8s/ns/software-application-innovation-lab-sail-projects-fcd6dfa/batch~v1~Job'
read -p "" < /dev/tty
echo '  - Cron jobs'
xdg-open 'https://console.apps.shift.nerc.mghpcc.org/k8s/ns/software-application-innovation-lab-sail-projects-fcd6dfa/batch~v1~CronJob'
read -p "" < /dev/tty
echo ''

clear; echo -e 'Running forecasts \nin RHODS?' | toilet -t -f smblock --rainbow -F border 
echo ''
echo 'Using RHODS:'
echo '  - Find the right Jupyter Notebook base image'
xdg-open 'https://github.com/opendatahub-io-contrib/workbench-images'
read -p "" < /dev/tty
echo '  - Build your own dependencies into your notebook image'
xdg-open 'https://github.com/hicsail/pecan-unconstrained-forecast/blob/main/Containerfile'
read -p "" < /dev/tty
echo '  - Deploy an Image Stream to NERC'
xdg-open 'https://github.com/OCP-on-NERC/PEcAn-app/blob/main/pecan/base/image.openshift.io/imagestreams/pecan-unconstrained-forecast/imagestream.yaml'
read -p "" < /dev/tty
echo '  - Team members create their own RHODS workbenches'
xdg-open 'https://rhods-dashboard-redhat-ods-applications.apps.shift.nerc.mghpcc.org/projects/software-application-innovation-lab-sail-projects-fcd6dfa'
read -p "" < /dev/tty
echo ''
