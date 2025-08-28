theme: /common

    state: RequestGreeting
        q!: $hello
        go!: /common/ResponseGreeting
    
    state: RequestHowAreYou
        q!: $howareyou
        go!: /common/ResponseHowAreYou
    
    state: RequestName
        q!: $askname
        go!: /common/ResponseName