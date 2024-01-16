# serverless-exercises

This is an empty Java project (used a dummy `Add.java` class) and has the gradle dependencies from the [L02P02 - Serverless exercise](https://bitbucket.ase.in.tum.de/projects/EIST24L02P02/repos/eist24l02p02-tests/browse/build.gradle).

The purpose of this is to have a Dockerfile that creates a docker image that contains the dependencies for the serverless exercise.

## Build

```bash
docker build -t serverless-exercise .
```