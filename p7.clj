(defn factors
  [x]
  (let [limit (java.lang.Math/sqrt x)]
    (map (fn [y] [y (quot x y)])
         (filter #(= (mod x %) 0) 
                 (take-while #(<= % limit) (iterate (partial + 2) 3))))))

(defn prime? 
  [x]
  (empty? (factors x)))

(def primes (cons 2 (filter prime? (iterate (partial + 2) 3))))

(time (println (first (drop 10000 primes))))
