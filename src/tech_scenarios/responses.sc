theme: /tech_service

    state: ResponsePrice
        a: |
            Стоимость обслуживания можно рассчитать тут: http://someautodealer/techservice#calculate
    
    state: ResponseWhen
        a: |
            График технического обслуживания можно узнать тут: http://someautodealer/techservice
    
    state: ResponseRepair
        a: |
            Мы сожалеем о случившемся. Позвоните нашим коллегам для решения ситуации: http://someautodealer/contacts

    state: ResponseWhyTO
        a: |
            Техническое обслуживание нужно, чтобы предотвратить вероятность случайных поломок, а также произвести регулировку всех основных узлов и агрегатов, чтобы максимально снизить расход топлива и смазочных материалов.
            *Вы можете сразу записаться на ТО.*
            go!: /main/RequestMaintenance
    
    state: ResponseNewCarIssue
        a: |
            Давайте запишу вас на техническое обслуживание?
            go!: /main/RequestMaintenance
    
    state: ResponseDiscount
        a: |
            Акции на техническое обслуживание представлены тут: http://someautodealer/techservice#actions
    
    state: ResponseDuration
        a: |
            В среднем техническое обслуживание занимает 2 часа. Зависит от конкретного плана работ.
    
    state: ResponsePlan
        a: |
            План работ технического обслуживания можно узнать тут: http://someautodealer/techservice