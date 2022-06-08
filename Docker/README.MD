## Petclinic app on EC2 using Docker
In this exercise, just like in Ansible task, petclinic app was set-up on EC2, but this time,
Docker was used to do it.

## How to
Do reproduce the results of this exercise, download docker-stack.yaml file, go to AWS 
CloudFormation -> Create Stack -> Upload docker-stack.yaml file as template ->
Specify stack details (fill stack name; instancetypeparameter is default t2.micro; fill ownername) 
-> configure stack options (a tag was made - key: School; value: RTU2022) -> create stack ->
connect to EC2 using Resources of the stack (DockerInstance Physical ID). Then the following 
commands in the EC2 were written:
- cd ~
- sudo docker version
- nano Dockerfile (in the editor, paste the Dockerfile code (from the repo))
- sudo docker build -t petclinic:5.3.0 .
- sudo docker images
- sudo docker pull springcommunity/spring-framework-petclinic
- sudo docker images
- sudo docker run -d --restart always --name petclinic -p 80:8080 petclinic:5.3.0
- sudo docker logs -n 50 -f petclinic

## Results
![Petclinic connection](https://ibb.co/W3xfq4m)
