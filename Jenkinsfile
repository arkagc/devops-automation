pipeline{
    agent any
    tools{
        maven 'maven 3.8.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/arkagc/devops-automation']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t devops-integration .'
                }
            }
        }
//         stage('Push image to dockerhub'){
//             steps{
//                 script{
//                     withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
//                         bat 'docker login -u arkagc -p ${dockerhubpwd}'
//                     }
//                     bat 'docker push devops-integration'
//                 }
//             }
//         }
    }
}