FROM ls1tum/artemis-maven-template:java17-20

# Copied from https://github.com/ls1intum/artemis-maven-docker/blob/adf5be335792a1cb4111672eaa0f085a517e3f8b/Dockerfile#L5
RUN apt-get update && apt-get upgrade -y && apt-get install -y \
    gnupg \
 && rm -rf /var/lib/apt/lists/*

# Copied from https://github.com/ls1intum/artemis-maven-docker/blob/adf5be335792a1cb4111672eaa0f085a517e3f8b/Dockerfile#L11
RUN echo "$LANG -- $LANGUAGE -- $LC_ALL" \
    && curl --version \
    && gpg --version \
    && git --version \
    && mvn --version \
    && java --version \
    && javac --version

ADD artemis-dos-template /opt/artemis-dos-template
RUN cd /opt/artemis-dos-template && pwd && ls -la && ./gradlew clean build && ./gradlew clean test check && ./gradlew --version && ./gradlew --stop
RUN rm -rf /opt/artemis-dos-template

ADD artemis-dos-springboot-template /opt/artemis-dos-springboot-template
RUN cd /opt/artemis-dos-springboot-template && pwd && ls -la && ./gradlew clean build && ./gradlew clean test check && ./gradlew --version && ./gradlew --stop
RUN rm -rf /opt/artemis-dos-springboot-template

# Copied from https://github.com/ls1intum/artemis-maven-docker/blob/adf5be335792a1cb4111672eaa0f085a517e3f8b/Dockerfile#L28
CMD ["mvn"]
