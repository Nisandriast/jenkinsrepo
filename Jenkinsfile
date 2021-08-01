#!/usr/bin/env groovy

def gv

pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("init") {
            steps {
                script {
                    echo "executing init block"
					sh 'whoami'
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo "executing building block"
					sh 'mvn package'
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                    sh 'docker build -t docknis22/nis:spring-boot-rest-services-0.0.1-SNAPSHOT.jar .'
					withCredentials([usernamePassword(credentialsId: 'docker-nis22', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
					sh "echo $USER"
					
					sh "docker login -u $USER -p $PWD"
					
					sh 'docker push docknis22/nis:spring-boot-rest-services-0.0.1-SNAPSHOT.jar'
					}
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying ....."
                }
            }
        }
    }
}
