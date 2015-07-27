(ns content-template-generator.layout.templateGenerator
  (:require [hiccup.page :refer [html5 include-css include-js ]]
            [utils.layout.util :refer [create-faded-modal-alert progress-bar-sample]]))

(defn create-modal [title]
  (html5
    ;<!-- Trigger the modal with a button -->
    (create-faded-modal-alert "Info" "This is a Text Message you may read <br>")))

(defn create-template-form [title]
  [:div.container {:id "main-container" :ng-controller "templateController" }
   [:h4 {:style "float:left"}title]
   [:a.btn.close-button {:href "#"  :aria-label "close"} "&times;"]
   [:br]
   [:hr]
   [:div.panel.panel-primary {:id "main-panel" :style "width:50%; display:block"}
        [:div.panel-heading {:style "text-align:left"}title]
        [:div.panel-body "Panel Body"
         [:input.file {:id "file-input-1" :type "file"}]
         ]]
   [:div.panel.panel-primary {:id "main-panel" :style "width:50%;display:block"}
    [:div.panel-heading {:style "text-align:left"}title]
    [:div.panel-body "Panel Body"
     [:input.file {:id "file-input-2" :type "file"}]
     ]]
   [:div.panel.panel-primary {:id "main-panel" :style "width:50%;display:block"}
    [:div.panel-heading {:style "text-align:left"}title]
    [:div.panel-body "Panel Body"
     [:input.file {:id "file-input-3" :type "file"}]
     ]]
  (include-js "/bootstrap-fileinput/js/fileinput.min.js")])



(defn create-generator-ui-test [title]
      [:body
       [:div.container {:id "main-container" :ng-controller "templateController"}
        [:a.btn.close-button {:href "#"  :aria-label "close"} "&times;"]
        [:br]
        [:div.panel.panel-primary {:id "main-panel"}
         [:div.panel-heading {:style "text-align:left"}title]
         [:div.panel-body
          [:input.file {:id "input-1" :type "file"}]
          ]]]
       (include-js "/bootstrap-fileinput/js/fileinput.min.js")
       ;(include-js "/bootstrap-3.3.5/dist/js/bootstrap.js")
       ])

(defn create-generator-ui [title]
  (html5
    (create-template-form title)
    ;(create-generator-ui-test "Arindam")
    ))
