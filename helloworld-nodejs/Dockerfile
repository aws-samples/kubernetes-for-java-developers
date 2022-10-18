FROM node:10.9.0-alpine

RUN npm install express
RUN npm install pug --save

ARG buildNumber="NOT_SET"
ARG shortCommit="NOT_SET"
ARG commitAuthor="NOT_SET"
ARG context

LABEL net.beedemo.workshop.build.number=$buildNumber
LABEL net.beedemo.workshop.commit=$shortCommit
LABEL net.beedemo.workshop.commit.author=$commitAuthor
LABEL net.beedemo.workshop.app.name=$context

ENV BUILD_NUMBER $buildNumber
ENV SHORT_COMMIT $shortCommit
ENV COMMIT_AUTHOR $commitAuthor
ENV CONTEXT $context

EXPOSE 8080

COPY views ./views 
COPY public ./public
COPY hello.js .

CMD node hello.js
