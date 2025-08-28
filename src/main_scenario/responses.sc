theme: /main
        
    state: Confirm
        a: |
            Оформляю заявку на техобслуживание на следующие данные:
            ФИО: {{capitalize($context.client.fio)}}
            Телефон: {{normPhone($context.client.phone)}}
            Автомобиль: {{$context.client.car}}.
            Наш сотрудник свяжется с вами и уточнит время.
