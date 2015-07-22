(ns core.layout.master_base_layout
  (:require [hiccup.page :refer [html5 include-css include-js ]]
            [utils.layout.util :refer [create-faded-modal-alert progress-bar-sample]]))

(defn base-html5-template [title request]
 (println (str request))
 (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
     [:meta {:name "viewport" :content "width=device-width, intial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"}]
     [:title title]
     ;(include-css "/bootstrap/dist/css/bootstrap.css")
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css")
     ;(include-css "/bootstrap/dist/css/bootstrap-theme.css")
     [:script
      (str "less = {env: \"development\",
                   async: false,
                   fileAsync: false,
                   poll: 1000,
                   functions: {},
                   dumpLineNumbers: \"comments\",
                   relativeUrls: false,
                   rootpath: \"\"
                   };")]
     ;(include-css "/bootstrap/less/bootstrap.less")
     ;[:link {:rel "stylesheet/less" :href "/bootstrap/less/bootstrap.less"}]
     [:link {:rel "stylesheet/less" :href "/less/style.less"}]
     ;(include-css "/less/style.less")
     (include-css "/css/custom.css")
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css")
     ]
    [:body ;{:ng-app "progressBar" :ng-controller "progressBarCtrl as pbCtrl" }
     [:div {:id "background-container"}
      [:div [:h3.text-center "New Banner"]]
      [:div {:id "nav-container"}
       [:nav.navbar.navbar-default
        [:div.container-fluid
         [:div.navbar-header
          [:button.navbar-toggle.collapsed {:type "button" :data-toggle "collapse" :data-target "#navbar-collapse-menu"}
           [:span.sr-only "Toggle Navigation"]
           [:span.icon-bar]
           [:span.icon-bar]
           [:span.icon-bar]]
          [:a.navbar-brand {:href ""} "Some Brand"]]

         [:div.collapse.navbar-collapse {:id "navbar-collapse-menu" }
         [:ul.nav.navbar-nav
          [:li [:a "Link1"]]
          [:li.dropdown
           [:a.dropdown-toggle {:data-toggle "dropdown" :role "button" :aria-expanded false}"DropDown"[:span.caret]]
           [:ul.dropdown-menu {:role "menu"}
            [:li[:a"menu1"]]
            [:li[:a"menu2"]]
            [:li.divider]
            [:li[:a"menu3"]]
            [:li[:a"menu4"]]]]]
         ]]]]]]
     ;(create-faded-modal-alert "Staples Dashboard" "This site is under construction")
     ;(progress-bar-sample)
     ;(include-js "/jquery/dist/jquery.js")
     (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js")
     (include-js "/bootstrap/dist/js/bootstrap.js")
     (include-js "/less.js-master/dist/less.js")
     ;(include-js "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js")
     (include-js "/angular/angular.min.js")
     (include-js "app/app.js")
     ))







(defn create-test [title]
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
     [:meta {:name "viewport" :content "width=device-width, intial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"}]
     [:title title]
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.css")
     (include-css "/bootstrap/dist/css/bootstrap.css")
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.css")
     (include-css "/bootstrap/dist/css/bootstrap-theme.css")

     ;(include-js "/angular/angular.min.js")
     ]
    [:body
     [:button {:class "btn btn-primary btn-sm" :data-toggle "modal" :data-target "#modalAlert"} "Show Modal"]
     (create-faded-modal-alert "Info" "This is a Text Message you may read")
     ;(include-js "/jquery/dist/jquery.js")
     (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js")
     ;(include-js "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.js")
     (include-js "/bootstrap/dist/js/bootstrap.js")
     ]))
