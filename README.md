# eist-artemis
Dockerfiles to build CI runner images related to the EIST lecture.
Language specific build tools shall fetch dependencies in the docker build step so that they are already cached for production.


## Build

```bash
# build images
docker build -t ghcr.io/ls1-courses/artemis-dos-java:$(date --iso) -f java/Dockerfile ./java
docker build -t ghcr.io/ls1-courses/artemis-dos-c:$(date --iso) -f c/Dockerfile ./c

# upload images
docker push ghcr.io/ls1-courses/artemis-dos-java:$(date --iso)
docker push ghcr.io/ls1-courses/artemis-dos-c:$(date --iso)
```

Don't forget to edit all template and solution build plans of all tasks to use this image. 


## Upstream artemis

Default build plans use:
- java/gradle: ls1tum/artemis-maven-template:java17-20
- C: sharingcodeability/fact:latest

According to https://docs.artemis.cit.tum.de/dev/docker.html the images likely originate from 
- java/gradle: https://github.com/ls1intum/artemis-maven-docker
- C: https://github.com/ls1intum/artemis-c-docker

Our images are maybe 10-20% bigger.
