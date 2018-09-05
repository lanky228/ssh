#!/bin/bash
workspace='/home/liuzhengri/桌面/ssh'
tomcatDir='/media/liuzhengri/document/tomcat'
tomcatName='apache-tomcat-9.0.8'

gradle clean
gradle build

tomcatPid=`ps -ef | grep $tomcatDir/$tomcatName | grep -v grep | awk '{print $2}'`
echo $tomcatPid

for id in $tomcatPid
	do
		kill -9 $id
	done
cp $workspace/build/libs/ssh.war $tomcatDir/$tomcatName/webapps
sh $tomcatDir/$tomcatName/bin/startup.sh
tail -fn 300 $tomcatDir/$tomcatName/logs/catalina.out