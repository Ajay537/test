def call(Map config){
    def name = config.name
    def path = config.path
    sh "echo ${name}"
    sh "echo ${path}"
    withEnv(['${name}=${path}']{
        sh "done"
    }
}
