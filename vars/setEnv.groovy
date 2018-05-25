def call(Map config){
    def name = config.name
    withEnv(['config.name=config.path']{
        sh "echo ${name}"    
    }
}
