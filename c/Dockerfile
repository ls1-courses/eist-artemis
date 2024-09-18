# based on https://github.com/ls1intum/artemis-c-docker/blob/main/Dockerfile

# code analysis (needs specific compiler)

FROM teeks99/clang-ubuntu:15
ARG RELEASE
ARG LAUNCHPAD_BUILD_ARCH
LABEL org.opencontainers.image.ref.name=ubuntu
LABEL org.opencontainers.image.version=23.04

RUN dpkg --configure -a
RUN apt update
RUN apt upgrade -y --autoremove
RUN apt-get install -y sudo --option=Dpkg::Options::=--force-confdef

RUN apt install -y --no-install-recommends python3 python3-pip python3-dev python3-psutil gcc git gdb make findutils bzip2 e2fsprogs
COPY requirements.txt /requirements.txt
RUN pip install -r /requirements.txt
# clean up apt installs

RUN apt clean && rm -rf /var/lib/apt/lists/*

# prepare for artemis runner
RUN useradd -m --uid 5000 artemis_user
RUN echo "artemis_user ALL=(ALL) NOPASSWD:ALL" > /etc/sudoers
USER artemis_user
CMD ["/bin/bash"]

