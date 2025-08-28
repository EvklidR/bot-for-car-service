theme: /main

    state: RequestMaintenance
        q!: {$maintenance [@mystem.persn]}
        script: saveUserData($context, $parseTree)
        go!: /main/CollectData
        
    state: CollectData
        q: {[@_car] [@mystem.persn] [@duckling.phone-number] *}
        script: checkAndAskData($context, $parseTree);
        if: $context.client.filled
            go!: /main/Confirm