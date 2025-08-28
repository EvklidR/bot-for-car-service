patterns:
    $priceVerb = (стои* | цен* | рассчита* | дорого* | дешев*)
    $priceQuery = {* $priceVerb * $TO *}

    $whenVerb = (надо | когда | ехать | проходить | делать)
    $whenTO = {* $whenVerb * $TO *}

    $repairAction = (почини* | исправь* | замени* | устрани* | верни* | слома*)
    $repairObject = (бампер | фильтр* | деталь* | работу)
    $repairClaim = {* $repairAction * [$repairObject] *}
    
    $whyVerb = (* зачем нужно * | * для чего * )
    $whyTO = {* $whyVerb * $TO *}
    
    $newCarIssue = (* купил машину * гудит * | * недавно приобрел * гудит *)
    $discountQuery = (* скидк* | * акци* )
    $durationQuery = (* сколько * по времени * | * сколько длится * | сколько * занимает )
    $planQuery = (* что входит *)