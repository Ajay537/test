def call(String command, int timeout){
    def sout = new StringBuilder(), serr = new StringBuilder()
    def proc = "${command}".execute()
    proc.consumeProcessOutput(sout, serr)
    proc.waitForOrKill(timeout)
    println "out> $sout err> $serr"
}