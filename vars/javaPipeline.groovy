def call(body){

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline {
        stages{
            stage('Java build'){
                steps{
                    echo "Java build for ${config.projectName}"
                    echo "Job id ${env.BUILD_ID}"
                    echo "Jar name ${config.appType}"
                }
            }
        }
    }

}