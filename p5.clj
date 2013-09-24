(def factors (range 11 21))

(def step (* 11 13 17 19))

(defn isit? [x]
  (every? #(= (mod x %) 0) factors))

(def cands (iterate (partial + step) step))

(time (println (first (filter isit? cands))))
