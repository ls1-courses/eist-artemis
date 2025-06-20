# based on ubuntu:24.04

# code analysis (needs specific compiler)
# update to use gcc13 as previous versions had issues with libasan:
# https://stackoverflow.com/questions/78136716/addresssanitizerdeadlysignal-from-fsanitize-address-flag

# Set the base image
FROM ubuntu:24.04
ARG RELEASE
ARG LAUNCHPAD_BUILD_ARCH
LABEL org.opencontainers.image.ref.name=ubuntu
LABEL org.opencontainers.image.version=24.04

RUN dpkg --configure -a
RUN apt update
RUN apt upgrade -y --autoremove
RUN apt-get install -y sudo --option=Dpkg::Options::=--force-confdef

RUN apt install -y --no-install-recommends python3 python3-pip python3-dev python3-psutil git gcc gdb make findutils bzip2 e2fsprogs
RUN apt install python3-git python3-yaml python3-schema -y

# clean up apt installs
RUN apt clean && rm -rf /var/lib/apt/lists/*

# prepare for artemis runner
RUN useradd -m --uid 5000 artemis_user
RUN echo "artemis_user ALL=(ALL) NOPASSWD:ALL" > /etc/sudoers
USER artemis_user
CMD ["/bin/bash"]
