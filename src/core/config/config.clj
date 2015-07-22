(ns core.config.config)

(def cdn
  (if (= (System/getenv "CDN_URL") nil) "../../../resources/public/" (System/getenv "CDN_URL")))
