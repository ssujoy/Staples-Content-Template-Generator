(ns core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            ;user file includes
            [core.layout.master_base_layout :refer [base-html5-template]]
            [content-template-generator.layout.templateGenerator :refer [create-generator-ui create-modal]]
            ))
 (use 'ring.middleware.session 'ring.util.request)
(defroutes app-routes
  (GET "/" [] (fn [request](base-html5-template "Staples SKU Build" request)))
  (GET "/generateTemplate" [] (create-generator-ui "SKU Build"))
  (GET "/generateModal" [] (create-modal "Hello Arindam"))
  (route/not-found "Not Found"))

(def app
  (->(wrap-defaults app-routes site-defaults)wrap-session))