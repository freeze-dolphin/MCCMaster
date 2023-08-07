#!/usr/bin/env bb

(require '[babashka.cli :as cli]
         '[babashka.tasks :as tasks]
         '[clojure.string :as st])

(defn fetch-n []
  (loop []
    (let [rst (tasks/shell {:out :string} "./gen_voca.sh")
          spd (st/split (:out rst) #"\,")
          type (st/trim (nth spd 1))]
      (if (= type "n")
        (st/capitalize (nth spd 0))
        (recur))
      )))

(defn fetch-adj []
  (loop []
    (let [rst (tasks/shell {:out :string} "./gen_voca.sh")
          spd (st/split (:out rst) #"\,")
          type (st/trim (nth spd 1))]
      (if (= type "adj")
        (st/capitalize (nth spd 0))
        (recur))
      )))

(println (str (fetch-adj) (fetch-n)))
