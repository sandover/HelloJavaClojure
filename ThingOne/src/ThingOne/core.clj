(ns ThingOne.core
 (:gen-class
    :methods [#^{:static true} [foo [int] void]]))

(defn -foo [i] (println "Hello from Clojure. My input was " i))

(defn -main [] (println "Hello from Clojure -main." ))
