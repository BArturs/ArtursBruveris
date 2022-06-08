## Petclinic app on EC2 and Docker using Ansible
In this exercise a stack was made using ansible-stack.yaml template in AWS Cloudformation. Then a connection to EC2 instance was made
and Petclinic was set-up on EC2 and Docker using Ansible.

## How to
Download the ansible-stack.yaml file, go to AWS CloudFormation -> Create Stack -> upload the ansible-stack.yaml template -> Specify details 
(Stack name: any; InstanceTypeParameter: default (t3.small); OwnerName: any) -> configure stack options (just a simple tag was made - 
Key: School; Value: RTU2022) -> create stack. Then from the stack's resources tab (after it is successfully made) go to AnsibleInstance 
Physical ID to connect to the EC2. Then the following commands are typed:
- cd ~
- ansible --version
- git clone https://github.com/spring-projects/spring-petclinic
- cd Repo/ansible
- export ANSIBLE_HOST_KEY_CHECKING=False
- ansible-galaxy install geerlingguy.java
- ansible-playbook playbook.yml -t ec2
- ansible-playbook playbook.yml -t clean_ec2_petclinic (THIS STOPS THE PETCLINIC PROCESS, NEXT COMMANDS ARE FOR DOCKER)
- pwd
- nano creds.sh
- export DOCKERHUB_USER="DOCKERHUB_LIETOTAJVARDS" (REPLACE WITH YOUR DOCKERHUB USERNAME)
- export DOCKERHUB_PASS="DOCKERHUB_PAROLE" (REPLACE WITH YOUR DOCKERHUB PASSWORD)
- source ./creds.sh
- ansible-playbook playbook.yml \
    -t docker \
    -e dockerhub_username=$DOCKERHUB_USER \
    -e dockerhub_password=$DOCKERHUB_PASS
- ansible-playbook playbook.yml -t clean_docker_petclinic (THIS STOPS THE PETCLINIC PROCESS ON DOCKER)

## Results
- ![Petclinic on EC2](https://ibb.co/Nx7sXCj)
- ![Petclinic on Docker](https://ibb.co/6rLNVym)
