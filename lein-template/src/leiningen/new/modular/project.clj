(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "A modular project created with lein new modular {{template}}"
  :url "http://github.com/{{user}}/{{name}}"

  :exclusions [com.stuartsierra/component]

  :dependencies
  [
   {{#library-dependencies}}
   {{{.}}}
   {{/library-dependencies}}
   ]

  :main {{name}}.main

  :repl-options {:init-ns user
                 :welcome (println "Type (dev) to start")}

  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.5"]]
                   :source-paths ["dev"
                                  ]}})
