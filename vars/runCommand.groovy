def call(Map config){
    def sout = new StringBuilder(), serr = new StringBuilder()
    def proc = "${config.command}".execute()
    proc.consumeProcessOutput(sout, serr)
    proc.waitForOrKill(config.timeout)
    println "out> $sout err> $serr"
}