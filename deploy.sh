#!/bin/bash

export MYSQL_YUBBI_URL="jdbc:mysql://yubbi-database.csebcqevndde.ap-northeast-2.rds.amazonaws.com:3306/yubbi"
export MYSQL_YUBBI_ID="admin"
export MYSQL_YUBBI_PW="12345678"

BUILD_JAR=$(ls /home/ec2-user/*.jar)
JAR_NAME=$(basename $BUILD_JAR)

echo "> build 파일명 : $JAR_NAME"

echo "> 현재 실행중인 애플리케이션 PID"
CURRENT_PID=$(pgrep -f $JAR_NAME)

if [ -z $CURRENT_PID ]
then
  echo "> 현재 구동중인 애플리케이션이 없으므로 종료하지 않습니다..."
else
  echo "> kill -15 $CURRENT_PID"
  kill -15 $CURRENT_PID
  sleep 5
fi

DEPLOY_JAR=/home/ec2-user/*.jar
nohup java -jar $DEPLOY_JAR > nohup.out 2>&1 &
