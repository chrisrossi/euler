(def X 1000)

(def Xs (range (int (* 0.9 X)) X))

(def products 
  (sort > (map #(apply * %) 
    (reduce #(conj %1 %2) #{} (for [x Xs y Xs] (sort [x y]))))))

(defn palindrome? [x]
  (let [s (str x)]
    (= s (clojure.string/reverse s))))

(time (println (first (filter palindrome? products))))
