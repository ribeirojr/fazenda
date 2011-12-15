(ns fazenda.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "fazenda"]
               (include-css "/css/reset.css")
               (include-css "/css/app.css")]
              [:body
               [:div#wrapper
                content]]))
