theme: /tech_service

    state: RequestPrice
        q!: $priceQuery
        go!: /tech_service/ResponsePrice
    
    state: RequestWhen
        q!: $whenTO
        go!: /tech_service/ResponseWhen
    
    state: RequestRepair
        q!: $repairClaim
        go!: /tech_service/ResponseRepair

    state: RequestWhyTO
        q!: $whyTO
        go!: /tech_service/ResponseWhyTO
    
    state: RequestNewCarIssue
        q!: $newCarIssue
        go!: /tech_service/ResponseNewCarIssue
    
    state: RequestDiscount
        q!: $discountQuery
        go!: /tech_service/ResponseDiscount
    
    state: RequestDuration
        q!: $durationQuery
        go!: /tech_service/ResponseDuration
    
    state: RequestPlan
        q!: $planQuery
        go!: /tech_service/ResponsePlan