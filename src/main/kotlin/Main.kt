fun main(args: Array<String>) {
    var d: ClientDataGatherer = ClientDataGatherer()
    d.gatherData()
    println(d.getData().hostname)
}