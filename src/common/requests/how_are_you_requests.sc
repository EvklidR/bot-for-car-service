theme: /common/howareyou
    
    state: RequestHowAreYouGood
        q: $good
        go!: /common/howareyou/ResponseHowAreYouGood

    state: RequestHowAreYouBad
        q: $bad
        go!: /common/howareyou/ResponseHowAreYouBad
