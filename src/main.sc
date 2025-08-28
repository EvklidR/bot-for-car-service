require: common/requests/requests.sc
require: common/requests/how_are_you_requests.sc
require: common/requests/name_answer_requests.sc
require: common/patterns.sc

require: common/responses/responses.sc
require: common/responses/how_are_you_responses.sc
require: common/responses/name_answer_responses.sc

require: main_scenario/patterns.sc
require: main_scenario/normPhone.js
require: main_scenario/requests.sc
require: main_scenario/responses.sc

require: main_scenario/saveData.js
require: main_scenario/checkAndAskData.js

require: tech_scenarios/patterns.sc
require: tech_scenarios/requests.sc
require: tech_scenarios/responses.sc

require: common_patterns.sc

theme: /

    init:
    
        bind("preProcess", function($context) {
            if ($context.request && $context.request.query) {
                var text = $context.request.query;
        
                if (text.length > 300) {
                    text = text.substring(0, 300);
                }
        
                text = text.replace(/[^а-яА-Яa-zA-Z0-9\s,.!?-]/g, " ");
        
                text = text.replace(/\s+/g, " ").trim();
        
                text = text.replace(/([!?])\1+/g, "$1");
        
                text = text.toLowerCase();
        
                $context.request.query = text;
            }
        });

    state: Start
        q!: $regex</start>
        a: Здравствуйте! Я бот автосервиса.
        a: Чем могу помочь?

    state: nom || noContext = true
        event!: noMatch
        a: Извините, я не понял. Можете переформулировать, чтобы я мог вам помочь?
