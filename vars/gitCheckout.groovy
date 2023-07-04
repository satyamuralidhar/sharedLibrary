def call(Map stagingParams) {
    checkout({
            branches: [[name: stagingParams.branch]],
            userRemoteConfigs: [[url: stagingParams.url]]
    })
}