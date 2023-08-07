#!/usr/bin/env bb

(require '[clojure.string :as st]
         '[babashka.cli :as cli])

(def cli-options {:voca {:coerce :string}})

(defn args [] (cli/parse-opts *command-line-args* {:spec cli-options}))

(defn filter-non-star [s]
  (let [ls (st/split s #"")
        filtered (filter #(not= "*" %) ls)]
    (apply str filtered)
    ))

(defn serialize [voca]
  (let [sp (st/split voca #"\[.*\]")]
    {
     :word (st/trim (filter-non-star (nth sp 0)))
     :type (st/trim (nth (st/split (nth sp 1) #"\.") 0))
     }))

(let [ser (serialize (:voca (args)))]
  (println (str (:word ser) "," (:type ser)))
  )
