enum class OS {
    WINDOWS, LINUX, MAC, SOLARIS
}

class ClientDataGatherer {
    var data: ClientData = ClientData()

    @JvmName("getData1")
    public fun getData(): ClientData {
        return this.data
    }
    public fun gatherData() {
        val os = System.getProperty("os.name").lowercase()
        when {
            os.contains("win") -> {
                gatherWindowsData()
            }

            os.contains("nix") || os.contains("nux") || os.contains("aix") -> {
                OS.LINUX
            }

            os.contains("mac") -> {
                OS.MAC
            }

            os.contains("sunos") -> {
                OS.SOLARIS
            }

            else -> null
        }
    }
    private fun gatherWindowsData() {
        data.hostname = System.getProperty("os.name")
    }
}