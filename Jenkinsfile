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
                    echo "build docker and push"
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
