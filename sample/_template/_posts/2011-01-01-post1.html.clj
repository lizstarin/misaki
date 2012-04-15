; @layout  post
; @title   Sample components
; @tag     tag1 tag2

(h2 "Link")
#-CLJ
(link "label" "http://localhost/")
CLJ
(link "label" "http://localhost/")

(h2 "Unordered list")
#-CLJ
(ul (range 3))
CLJ
(ul (range 3))

(h2 "Definition list")
#-CLJ
(dl {:a 1, :b 2})
(dl [:hello "world" :foo "bar"])
CLJ
(dl {:a 1, :b 2})
(dl [:hello "world" :foo "bar"])

(h2 "Block quote")
#-CLJ
(blockquote
  "foo
  bar"
  [:a {:href "#"} "baz"])
CLJ
(blockquote
  "foo
  bar"
  [:a {:href "#"} "baz"])

(h2 "Inline code")
#-CLJ
(code "clojure.core/+")
CLJ
(code "clojure.core/+")

(h2 "Source code")
[:p "Comment out following code."]
#-CLOJURE
#-CLJ
(let [msg "world"]
  (println "hello," msg))
CLJ
CLOJURE

#-CLJ
(let [msg "world"]
  (println "hello," msg))
CLJ

(h2 "JavaScript")
#-CLJ
(js "a.js" "b.js")
CLJ

(h2 "Style Sheet")
#-CLJ
(css "a.css" "b.css")
CLJ
