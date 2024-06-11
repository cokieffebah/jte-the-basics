void call() {
    stage("dotnet:build") {
        println(stepContext.name)
    }
}
