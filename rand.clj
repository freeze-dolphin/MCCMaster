#!/usr/bin/env bb

(require '[babashka.cli :as cli])

(def cli-options {:limit {:default 10 :coerce :long}})

(defn args [] (cli/parse-opts *command-line-args* {:spec cli-options}))

(prn (int (rand (:limit (args)))))
