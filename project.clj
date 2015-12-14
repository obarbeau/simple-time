(defproject simple-time "0.3.0"
  :description "A dead-simple datetime/timespan library"
  :url "https://github.com/mbossenbroek/simple-time"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0-RC3"]
                 [joda-time "2.9.1"]]
  :plugins [[codox "0.6.6"]]
  :codox {:include [simple-time.core]
          :src-dir-uri "https://github.com/mbossenbroek/simple-time/tree/master/"
          :src-linenum-anchor-prefix "L"})
