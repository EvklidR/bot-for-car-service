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

    state: Start
        q!: $regex</start>
        a: Здравствуйте! Я бот автосервиса.
        a: Чем могу помочь?

    state: nom || noContext = true
        event!: noMatch
        a: Извините, я не понял. Можете переформулировать, чтобы я мог вам помочь?
