theme: /common

    state: ResponseGreeting
        a: Здравствуйте!
    
    state: ResponseHowAreYou
        a: Отлично! А у вас? / А вы?
        go: /common/howareyou

    state: ResponseName
        a: Меня зовут Вася.
        go: /common/nameanswer
        