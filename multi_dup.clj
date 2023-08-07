#!/usr/bin/env bb

(require '[babashka.cli :as cli]
         '[babashka.tasks :as tasks])

(def cli-options {:amount {:default 10 :coerce :int}})

(defn args [] (cli/parse-opts *command-line-args* {:spec cli-options}))

(doseq [_ (range (:amount (args)))]
  (tasks/shell "bash dup_conf.sh"))
