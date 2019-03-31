# Remove Docker Images
docker rmi $(docker images -q)
docker rmi <img id>

# Remove Docker All Containers.
docker rm $(docker ps -a -q)

# Build Docker Image
docker build - < Dockerfile
doccker build -t <img name> </path/to/Dockerfile>
docker build . # if Dockerfile is located in root, will be built without a tag.

# Tag an untagged image
docker tag <img id> <new tag name>

# Run Docker Container
docker exec -it <container id> /bin/bash

# Stop Docker Container
docker stop <container id>
docker kill <container id>

# Delete Docker Container
docker rm <container id>

# Stop all Docker Containers
docker stop $(docker ps -a -q)

# Remove all Docker Containers
docker rm $(docker ps -a -q)

# Run Docker Container
docker run -i -t -p 8080:8080 41302cc0131e

docker run [OPTIONS] IMAGE[:TAG|@DIGEST] [COMMAND] [ARG...]
docker run -rm -i -t -e "L3POD=p98/henry" -e "L3IMAGE=app-name" <img name>  /bin/bash
docker run -i -t -p 6004:6004 -e "L3POD=p98/henry" -e "L3IMAGE=app-name" <img name>