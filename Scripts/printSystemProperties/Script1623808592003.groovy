
def systemProperties = [
	"java.vendor",
	"java.vendor.url",
	"java.version",
	"java.vm.info",
	"java.vm.name",
	"java.vm.specification.name",
	"java.vm.specification.vendor",
	"java.vm.specification.version",
	"java.vm.vendor",
	"java.vm.version",
	"os.arch",
	"os.name",
	"os.version"]

StringBuilder sb = new StringBuilder()
for (prop in systemProperties) {
	sb.append("${prop}=${System.getProperty(prop)}\n")
}

print(sb.toString())