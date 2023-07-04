def call(Map stagingParams) {
    checkout([
            $class: "GitSCM",
            branches: [[name: stagingParams.branch]],
            userRemoteConfigs: [[url: stagingParams.url]]
    ])
}
